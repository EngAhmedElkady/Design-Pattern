class SingletonClass:
    """_summary_

    Attributes:
        _instance (_type_): _description_

    """

    _instance = None

    def __new__(cls):
        """_summary_

        Returns:
            _type_: _description_
        """
        if cls._instance is None:
            print("Creating the object")
            cls._instance = super(SingletonClass, cls).__new__(cls)
        return cls._instance
    
    def __init__(self) -> None:
        pass


obj1 = SingletonClass()
print(obj1)

obj2 = SingletonClass()
print(obj2)
