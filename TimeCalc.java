public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMin = (hours*60) + minutes + minutesToAdd;
        int finalHour = (totalMin / 60) %24; 
        int finalMin = totalMin%60;
        if(finalMin<10)
        {
        if(finalHour<10){
            System.out.println("0"+finalHour +":" +  "0" + finalMin);
        }
        else{
            System.out.println(finalHour + ":" + "0"+finalMin);
        }
        }
        if (finalMin>10) {
 if(finalHour<10){
            System.out.println("0"+finalHour + ":" + finalMin);
        }
        else{
            System.out.println(finalHour + ":" + finalMin);
        }
            
        }
    }
}
