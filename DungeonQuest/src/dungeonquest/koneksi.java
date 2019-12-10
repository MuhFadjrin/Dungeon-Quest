package dungeonquest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {

    public static Connection con;
    public static Statement stm;
    Main m = new Main();

    public static void main(String args[]) {
//        try {
//            String url = "jdbc:mysql://localhost/DungeonQuest";
//            String user = "root";
//            String pass = "";
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(url, user, pass);
//            stm = con.createStatement();
//            System.out.println("koneksi berhasil;");
//        } catch (Exception e) {
//            System.err.println("koneksi gagal" + e.getMessage());
//        }
        

    }

    public void cek() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dungeonquest", "root", "");
            Statement stmt = conn.createStatement();
            String sql = "SELECT save FROM variable;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                if (rs.getInt(1) == 1) {
                    m.var[0] = 1;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void continueGame(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dungeonquest", "root", "");
            Statement stmt = conn.createStatement();
            String variable = "SELECT * FROM variable;";
            ResultSet rs = stmt.executeQuery(variable);
            while (rs.next()) {
                m.var[0]=rs.getInt("save");
                m.indeks[0] = rs.getInt("save");
                m.var[1]=rs.getInt("floor");
                m.var[2]=rs.getInt("curfloor");
                m.var[3]=rs.getInt("ending");
            }
            String player = "SELECT * FROM player;";
            rs = stmt.executeQuery(player);
            while (rs.next()) {
                m.player[0] = rs.getInt(1);
                m.indeks[1] = rs.getInt(1);
                m.player[1] = rs.getInt(2);
                m.player[2] = rs.getInt(3);
                m.player[3] = rs.getInt(4);
                m.player[4] = rs.getInt(5);
                m.player[5] = rs.getInt(6);
                m.player[6] = rs.getInt(7);
                m.player[7] = rs.getInt(8);
            }
            String equipment = "SELECT * FROM equipment";
            rs = stmt.executeQuery(equipment);
            while(rs.next()){
                if(rs.getInt(1)==0){
                    m.iEquipment[0][0] = rs.getInt(2);
                    m.iEquipment[0][1] = rs.getInt(3);
                    m.iEquipment[0][2] = rs.getInt(4);
                }else{
                    m.iEquipment[1][0] = rs.getInt(2);
                    m.iEquipment[1][1] = rs.getInt(3);
                    m.iEquipment[1][2] = rs.getInt(4);
                }
            }
            String inventory = "SELECT * FROM inventory";
            rs = stmt.executeQuery(inventory);
            while (rs.next()) {
                m.iInventory[0]= rs.getInt(1);
                m.indeks[2] = rs.getInt(1);
                m.iInventory[1]= rs.getInt(2);
                m.iInventory[2]= rs.getInt(3);
                m.iInventory[3]= rs.getInt(4);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void saveGame(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dungeonquest", "root", "");
            Statement stmt = conn.createStatement();
            String sql = "UPDATE variable SET save=" + m.var[0] + ", floor=" + m.var[1] + ",curfloor="+m.var[2]+",ending="+m.var[3]+" WHERE save=" + m.indeks[0] + "";
            stmt.executeUpdate(sql);
            m.indeks[0]= m.var[0];
            String player = "UPDATE player SET level="+m.player[0]+",health="+m.player[1]+",exp="+m.player[2]+",attack="+m.player[3]+",defend="+m.player[4]+",weapon="+m.player[5]+",armor="+m.player[6]+",gold="+m.player[7]+" WHERE level="+m.indeks[1]+";";
            stmt.executeUpdate(player);
            m.indeks[1]=m.player[0];
            String equipment1 = "UPDATE equipment SET equip1="+m.iEquipment[0][0]+",equip2="+m.iEquipment[0][1]+",equip3="+m.iEquipment[0][2]+" WHERE indeks=0;";
            stmt.executeUpdate(equipment1);
            String equipment2 = "UPDATE equipment SET equip1="+m.iEquipment[1][0]+",equip2="+m.iEquipment[1][1]+",equip3="+m.iEquipment[1][2]+" WHERE indeks=1;";
            stmt.executeUpdate(equipment2);
            String inventory = "UPDATE inventory SET HP_Potion="+m.iInventory[0]+",Slime_Gel="+m.iInventory[1]+",`Goblin Bone`="+m.iInventory[2]+",`Wolf Bone`="+m.iInventory[3]+" WHERE HP_Potion="+m.indeks[2]+";";            
            stmt.executeUpdate(inventory);
            m.indeks[2]=m.iInventory[0];
            JOptionPane.showMessageDialog(null, "Save Berhasil", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Gagal", JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }

}
