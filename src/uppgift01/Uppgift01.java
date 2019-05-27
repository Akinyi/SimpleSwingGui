/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uppgift01;

import java.time.*; // import av library java.time för alla anrop till metoder
                    // LocalDateTime()
import javax.swing.*; //Import av standard library class 'javax.swing.*' 
                      // för JOptionPane.showMessageDialog() och JOptionPane.
                       // showInputDialog()
import java.util.*; // Import av library class 'java.util.*'
public class Uppgift01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //===================================================================//
  //a) Uppgift
  /**
    * Program som kompilerar ett program där klassen LocalDateTime anropar 
    * metoden 'now()' och anpassar det till formatet åååå-mm-dd tt:mm:ss
   */
 JOptionPane.showMessageDialog(null, "Datum och tid: \n" + LocalDateTime.now());
 // ger till exempel 2017-08-29T07:30:12.828 
 String longTime = LocalDateTime.now().toString();// Variabel av typ string 
 // med namn 'longTime' initieras med en klass 'LocalDateTime' 
 // som anropar en metod 'now', vilket typomvandlas till string genom att anropa
 // metoden '.toString()'

 String lT1 = longTime.replace('T',' '); // En ny string lT1 initieras där 
 // char 'T' ersätts av ' ' i String variabeln 'longTime'. 
 //  Datumet ser nu ut : 2017-08-29 07:30:12.828 
 // Vi vill få hela denna datum och tid förutom de sista fyra siffrorna.
 int tpoint = lT1.indexOf('.');// En int variabel med namn tpoint initieras där 
 // indexet av char '.' i string lT1 hittas genom att anropa metoden .indexOf(). 
 // indexet av första char i lT1 är alltid 0.
 String lT2 = lT1.substring(0,tpoint);// En substring görs av lT1 mellan index
 // 0 och tpoint. Den nya substring som deklareras och initieras med detta värde 
 // heter lT2. Denna string ska nu ha formatet åååå-mm-dd tt:mm:ss
 JOptionPane.showMessageDialog(null, lT2);// Jag anropar klassen JOptionPane och 
 // anropar showMessageDialog i vilket den nya string datum och tid visas. 
 //=====================================================================//

// b)Uppgift
/**
 * Ett program so läser in förnamn och efternamn och visar det i gemener i format
 * fornamn.efternamn@nackademin.se
 */
String namn = JOptionPane.showInputDialog("Skriv ditt namn enligt modellen: "
        + "förnamn efternamn"); 
/** 
 * En string med namnet 'namn' initieras med en klass  'JOptionPane' 
 * och anrop till metoden 'showInputDialog' vilket låter användaren att skriva
 * sitt förnamn och efternamn.
 */
String n1 = (namn.trim()).replace(' ','.').toLowerCase();
/*
* string namn förkortas genom att tomrummet i början och i slutet av namnen tas bort. Detta 
* görs med namn.trim(). Detta i sin tur har char ' ' ersatt av char '.' med metoden replace().
*Resultatet konverteras till gemener med anrop till metoden toLowerCase(). 
*Den nya stringen n1 initieras med resultatet.
*/
String n4 = n1.replace('ä','a').replace('å','a').replace('ö', 'o');
/*
* Alla char 'ä' ersätts nu av 'a' i tur och ordning i string n1 med metoden 'replace()'.
* Alla char 'å' ersätts av 'a' i den resulterande strängen. Sist ersätts 'ö' av 'o'. 
* Den resulterande string är ett värde som en ny string n4 ges.
*/

JOptionPane.showMessageDialog(null,n4+"@nackademin.se");
/*
*En JOptionPane klass anropr metoden showMessageDialog i vilket den nya strängen
*n4 + @nackademin.se visas.
*/
//=================================================================//
    }
    
}
