
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mete
 */
public class BotIslemleri {

    private int botSecim;
    
    

    public int botTiklama() {

        botSecim = (int) (Math.random() * 10);

        while (botSecim == 0) {
            botSecim = (int) (Math.random() * 10);
        }

      return botSecim;
    }

   

}
