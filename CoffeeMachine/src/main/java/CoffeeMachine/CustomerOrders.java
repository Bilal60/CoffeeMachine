package CoffeeMachine;

public class CustomerOrders {
	
	private String command;

	//Constructeur
	public CustomerOrders(String command){
		this.command = command;
	}


	public String drinkMakerMessage() {
		//separartion de la chaine de caractères command suivant un délimiteur
		String splitedCommand[] = this.command.split(":", -1);
		String drinks ="";
		String suggarAndStick = "";

		for (int i = 0; i < splitedCommand.length; i++) {
            if(splitedCommand[0].equals("T")){
            	drinks = "tea";
            }else if(splitedCommand[0].equals("H")){
            	drinks = "chocolate";
            }else if(splitedCommand[0].equals("C")){
            	drinks = "coffee";
            }

            if(splitedCommand[1].equals("")){
            	suggarAndStick = "no sugar - and therefore no stick";
            }

        }
        String message = "Drink maker makes 1 "+drinks+" with "+suggarAndStick;
        return message;
	}
	
}
