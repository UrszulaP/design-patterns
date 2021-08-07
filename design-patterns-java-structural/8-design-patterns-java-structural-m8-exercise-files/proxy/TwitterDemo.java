package proxy;

public class TwitterDemo {

	public static void main(String[] args) {
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceImpl());  // tworzy obiekt proxy z obiektu; w 1 przykładzie używamy TwitterServiceStub()
		
		System.out.println(service.getTimeline("bh5k"));  // argument nie robi nic
		
		service.postToTimeline("bh5k", "Some message that shouldn't go through.");  // proxy nie pozwala na wywołanie tej metody
	}
}

// pozwala na używanie obiektu w kontrolowany sposób, przez proxy. Może być security proxy - np. uniemożliwiać korzystanie z jakiejś metody.

//▪ Interface by wrapping
//▪ Can add functionality
//▪ Security, Simplicity, Remote, Cost
//▪ Proxy called to access real object
//▪ Examples:
//	▪ java.lang.reflect.Proxy
//	▪ java.rmi.*
//
//▪ Can add functionality, but not its
//main purpose
//▪ Can only have one proxy
//▪ Compile time

//• Great utilities built into Java API
//• Only one instance
//• Used by DIJ/IOC Frameworks (Spring)
