package Ts2Dashboard;

class User {
    private String userName;
    private Drop[] drops;

    public User(String userName, int dropCount) {
        this.userName = userName;
        this.drops = new Drop[dropCount];
    }

    public String getUserName() {
        return userName;
    }

    public void setDrop(int index, Drop drop) {
        this.drops[index] = drop;
    }

    public Drop getDrop(int index) {
        return drops[index];
    }
}

