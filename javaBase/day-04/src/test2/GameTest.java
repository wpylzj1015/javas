package test2;

public class GameTest {
    public static void main(String args[]) {
        Role r1 = new Role("李镇江", 100, '女');
        Role r2 = new Role("王鹏瑶", 100, '男');

        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();
    }
}
