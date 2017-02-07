package core;

public class Configuration 
{
	public String host;
	public String port;
	public String db;
	public String user;
	public String pwd;
	
	public Configuration(String host, String port, String db, String user,
			String pwd) {
		super();
		this.host = host;
		this.port = port;
		this.db = db;
		this.user = user;
		this.pwd = pwd;
	}
	
	public Configuration(){
		//
	}
	
	
}
