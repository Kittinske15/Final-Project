package gui.frame;

import model.Menus;
import model.UserList;
import java.io.FileNotFoundException;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UserList.setUser();
        Menus.setMenu();
        new Login().setVisible(true);
        //new Table().setVisible(true);

    }
}
