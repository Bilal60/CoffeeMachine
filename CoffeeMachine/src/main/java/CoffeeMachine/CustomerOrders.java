package CoffeeMachine;

public class CustomerOrders {
	
	private String command;
	private int money;

	//Constructeur
	public CustomerOrders(String command, int money){
		this.command = command;
		this.money = money;
	}


	public String drinkMakerMessage() {
		//separartion de la chaine de caractères command suivant un délimiteur
		String splitedCommand[] = this.command.split(":", -1);
		String drinks ="", suggarAndStick ="", message ="";

        if(splitedCommand[0].equals("T") && this.money >= 40){
        	drinks = "tea";
        }else if(splitedCommand[0].equals("H") && this.money >= 50){
        	drinks = "chocolate";
        }else if(splitedCommand[0].equals("C") && this.money >= 60){
        	drinks = "coffee";
        }

        
        if(splitedCommand[1].equals("")){
        	suggarAndStick = "no sugar - and therefore no stick";
        }else if(splitedCommand[1].equals("1")){
        	suggarAndStick = "1 sugar and a stick";
        }else if(splitedCommand[1].equals("2")){
        	suggarAndStick = "2 sugars and a stick";
        }
        
        if(drinks == "") {
        	return message = "Missing X cents ";
        }else {
        	return message = "Drink maker makes 1 "+drinks+" with "+suggarAndStick;
        }
	}
	
}
