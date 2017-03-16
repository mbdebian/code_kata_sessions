# This is a messy playground for OOP concepts

# This is a simple class
class ClassA:
    def __init__(self):
        self.__id = 0
        self.__name = "ClassA - Name"
        print("Class A - Instance")

    # Without annotations
    def getId(self):
        return self.__id

    def setId(self, id):
        self.__id = id

    # With annotations
    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, name):
        self.__name = name

    def methodOne(self):
        print("method One CALLED!")

# This class inherits from "ClassA"
class ClassB(ClassA):
    __new_id = 0
    __new_name = "ClassB - Name"
    
    def __init__(self):
        super().__init__(self)




# This is an abstract class
class AbstractClass