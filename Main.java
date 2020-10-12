import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
      Student student1 = new Student();
      student1.setName("Arnold Spielberg");
      student1.setGPA(4.0);
      student1.setMajor("Electrical Engineering");
      
      Student student2 = new Student();
      student2.setName("Lou Rahm");
      student2.setGPA(4.3);
      student2.setMajor("Information Systems");


      student1.print();
      student2.print();

      
      ArrayList<Double> gpaAvg = new ArrayList<Double>();
      
      gpaAvg.add(student1.gpa);
      gpaAvg.add(student2.gpa);
      double sum = 0;

      for ( int i=0; i < gpaAvg.size(); i++){
        sum += gpaAvg.get(i);
      }
     
      System.out.println("The Average GPA is " + sum / gpaAvg.size());

    }


}


