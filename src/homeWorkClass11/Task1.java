package homeWorkClass11;

public class Task1 {
   /* Create a 2D array(shorter way) in which first array will
    consist of 4 names and second array will contain grades.
    Then your program should print name of the students that has A and B grade*/
   public static void main(String[] args) {
       String[][] names={{"Britany","Max","Rickey","Christi"},
               {"A","C","B","A"}};
       for(int i=0;i< names.length;i++){
           for (int j=0;j<names[i].length;j++){
               if (names[i][j].equalsIgnoreCase("a")){
                   System.out.println(names[i-1][j]+" has grade 'A'");

               }
               else if (names[i][j].equalsIgnoreCase("b")) {
                   System.out.println(names[i-1][j]+" has grade 'B'");

               }
           }
           }
       }
   }

