class LoggerSingleton{

    private static LoggerSingleton loggerSingleton = new LoggerSingleton();

    private LoggerSingleton(){}  
      
    public static LoggerSingleton getInstance(){  
     return loggerSingleton;  
    }  
     
    public void log(String s){  
        System.out.println("Pretending to log: " + s);
    }  

}