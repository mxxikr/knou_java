package thefourth;

class CSuper {
    private int f1;
    public int f2;

    public void setPrivate(int i) {
        f1 = i;
    }

    public void setPublic(int i) {
        f2 = i;
    }

    private void mPrivate() {
        f1 = 30;
    }
}