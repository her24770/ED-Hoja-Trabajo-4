public class Factory {
    
    public static <T> IStack<T> stackFactory(String option){
        switch (option){
            case "1":
                return new VecStack<T>();
            break;

            case "2":
                return new ArrayLStack<T>();
            break;

            case "3.1":
                return listFactory("3.1");
            break;

            case "3.2":
                return listFactory("3.2");
            break;
        }
    }

    public static <T> IList<T> listFactory(String option){
        switch(option){
            case "3.1":
                return new LList<T>();
            break;

            case "3.2":
                return new DLList<T>();  
            break;
        }
    }
}