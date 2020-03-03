package environmentController;

import lombok.Getter;
import lombok.Setter;

public class TestAppEnv {

	private String password = "nananana";

	@Getter @Setter
   	public String	DOMAIN	=	"192.123.0.3";

	@Getter @Setter
	public String	PORT	=	"67";

	@Getter @Setter
   	public String URL = "http://"	+	DOMAIN	+	":"	+	PORT;

	public String getPassword(){
		return this.password;
	}

/*   	public String	getUrl() { return this.URL; }

   	public void setUrl(String newValue){
   		this.URL = newValue;
	}*/

	public TestAppEnv(){

	}
}

