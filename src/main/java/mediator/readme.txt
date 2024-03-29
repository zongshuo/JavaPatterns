中介者模式
    用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示的相互引用，从而使其耦合松散，而且可以独立的改变他们之间的交互。
    如果仅仅需要一个具体中介，模式中的中介者接口可以省略。
优缺点：
    1、可以避免许多对象为了之间的通信而相互显示引用，否则不仅系统难于维护，而且也是其他系统难于复用这些对象。
    2、可以通过中介者将原本分布于多个对象之间的交互行为集中在一起。当这些对象需要改变之间的通信行为时，只需要使用一个具体中介者即可，不必修改各个具体同事的代码，即这些同事可以重用。
    3、具体中介者使得各个具体同事完全解耦，修改任何一个同事的代码不会影响到其他同事。
    4、具体中介者集中了同事之间如何交互的细节，使系统比较清楚的知道整个系统中的同事是如何交互的。
    5、当一些对象想相互通信，但又无法包含对方的引用，那么使用中介者模式就可以使这些对象相互通信。
    6、当同事较多时，中介者会非常复杂，难以维护。
模式角色：
    1、中介者：中介者是一个接口，该接口定义了用于同事间进行通信的方法。
    2、具体中介者：具体中介者是实现中介者接口的类。具体中介者中需要包含所有具体同事的引用
    并通过实现中介者接口中的方法来满足具体同事之间的通信请求。
    3、同事：一个接口，规定了具体同事需要实现的方法。
    4、具体同事：实现同事接口的类。具体同事中需要包含具体中介者的引用，一个具体同事需要和其他具体同事交互时，只需要将自己的请求通知给它所包含的具体中介者即可。
使用场景：
    1、许多对象以非常复杂的方式交互，所导致的依赖关系使系统难以理解和维护。
    2、一个对象引用其他很多对象，导致难以复用该对象。