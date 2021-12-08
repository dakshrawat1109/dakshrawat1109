
public class Hospital
{
   public static void main (String[] args)
   {
      HospitalEmployee Sweety = new HospitalEmployee ("Sweety", 123);
      Doctor Sayali = new Doctor ("Sayali", 234, "Heart");
      Surgeon Jyoti = new Surgeon ("Jyoti", 645, "Brain", true);
      Nurse Minaxi = new Nurse ("Minaxi", 789, 6);
      

      System.out.println (Sweety);
      System.out.println (Sayali);
      System.out.println (Jyoti);
      System.out.println (Minaxi);
      

      Sweety.work();
      Sayali.work();
      Jyoti.work();
      Minaxi.work();
     
   }
}
