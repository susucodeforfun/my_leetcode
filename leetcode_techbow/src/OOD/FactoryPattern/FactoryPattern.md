Factory Pattern 在创建对象是不会对客户端暴露创建逻辑，并且通过使用一个共同接口指向新创建的对象
目的： 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行
实现： 创建一个Shape接口和实现Shape接口的实体类。 下一步定义工厂类 ShapeFactory
FactoryPatternDemo类使用ShapeFactory获取对象，向ShapeFactory传递信息(Circle,Rectangle,Square)
