

package onlineexam;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jaimin
 */
public class OnlineExam {

   
    public static void main(String[] args) {

        //Display the menu containing all the streams/branches in college
        Dashboard_1 d1= new Dashboard_1();
        d1.show();
        
        
    }
    
}

//To run this prject completely ensure that:
// You have a complete database of students from all sections and all years and all branches;
//You have assigned the right and separate section coordinators in the students table to each section;
//Everything else is pretty intuitive


