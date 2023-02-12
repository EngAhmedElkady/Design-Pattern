// class singleton_pattern
// Description: This class implements the singleton pattern

class singleton_pattern
{
    // Private static instance of the class
    private static singleton_pattern instance = null;

    // Private constructor
    private singleton_pattern()
    {
        
    }

    // Public static method to get the instance of the class
    public static singleton_pattern getInstance()
    {
        // If the instance is null, create a new instance
        if (instance == null)
        {
            instance = new singleton_pattern();
        }

        // Return the instance
        return instance;
    }
}