class car:

    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    
    def accelarate(self):
        print("The ",self.manufacturer," ",self.model," is Accelarating")

    def stop(self):
        print("The ",self.manufacturer," ",self.model," is Stopped now")


car1 = car('chevorlet','cruze','2017','mannual','black')
car2 = car('Lamborghini','huracan','2020','mannual','black')
car3 = car('Lamborghini','Urus','2021','Auto','Blue')

car2.accelarate()
car3.stop()