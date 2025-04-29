package thetenth;

import java.io.IOException;
import java.nio.file.*;

public class WatchServiceMain {

    public static void main(String[] args) {
        // WatchService 객체를 초기화
        try (WatchService watchService = FileSystems.getDefault().newWatchService()) {

            // 감시하려는 디렉터리 경로를 지정 (디렉터리가 존재해야 함)
            Path directoryToWatch = Paths.get("C:\\Users\\user\\Documents");

            // 디렉터리가 존재하는지 확인
            if (!Files.exists(directoryToWatch)) {
                System.out.println("디렉터리가 존재하지 않습니다: " + directoryToWatch);
                return;
            }

            // 감시 대상 디렉터리 등록 및 감지할 이벤트 종류 지정
            directoryToWatch.register(
                    watchService,
                    StandardWatchEventKinds.ENTRY_CREATE,  // 파일 생성 이벤트 감지
                    StandardWatchEventKinds.ENTRY_DELETE,  // 파일 삭제 이벤트 감지
                    StandardWatchEventKinds.ENTRY_MODIFY   // 파일 수정 이벤트 감지
            );

            System.out.println("디렉터리 감시를 시작합니다: " + directoryToWatch);

            // 무한 루프로 감시 시작
            while (true) {
                // 이벤트가 발생할 때까지 대기, 발생 시 WatchKey 객체 반환
                WatchKey watchKey = watchService.take();

                // 발생한 이벤트 목록을 가져옴
                for (WatchEvent<?> event : watchKey.pollEvents()) {
                    // 이벤트의 종류를 가져옴 (생성, 삭제, 수정 중 하나)
                    WatchEvent.Kind<?> kind = event.kind();

                    // 감지된 이벤트의 컨텍스트(변화가 일어난 파일/디렉터리 이름)
                    Path fileName = (Path) event.context();

                    // 각 이벤트에 따라 처리 로직을 실행
                    if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
                        System.out.println("파일 생성 감지: " + fileName.getFileName());
                    } else if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
                        System.out.println("파일 삭제 감지: " + fileName.getFileName());
                    } else if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
                        System.out.println("파일 수정 감지: " + fileName.getFileName());
                    }
                }

                // WatchKey 리셋 (다시 유효한 상태로 만들기 위함)
                boolean valid = watchKey.reset();

                // WatchKey가 더 이상 유효하지 않으면 루프 종료
                if (!valid) {
                    System.out.println("감시 키가 더 이상 유효하지 않아 프로그램 종료.");
                    break;
                }
            }
        } catch (IOException e) {
            // 감시 서비스 초기화 도중 발생하는 IOException 처리
            e.printStackTrace();
        } catch (InterruptedException e) {
            // take() 호출 중 인터럽트 발생 시 처리
            e.printStackTrace();
            Thread.currentThread().interrupt(); // 현재 스레드 상태를 재설정
        }
    }
}
