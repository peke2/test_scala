import java.sql._
import java.sql.Connection
import java.util.Properties


//val Driver = Class.forName("com.mysql.jdbc.Driver").newInstance().asInstanceOf[Driver]


	val connectionProps = new Properties();
	connectionProps.put("user", "root");
	connectionProps.put("password", "root");

	val conn:Connection = DriverManager.getConnection("jdbc:mysql://localhost:53306/test_db", connectionProps);
	//conn.setCatalog(this.dbName);

	val st = conn.prepareStatement("select * from hello")
	val rs = st.executeQuery()

	while( rs.next() )
	{
	//	rs.getArray(1)
	//	var arr = rs.getArray(rs.getRow())
	//	println(arr)
		println( rs.getLong("id") )
		println( rs.getString("comment") )
		println( rs.getLong("value") )
		println( rs.getString("date") )

		rs.map{
			case (key:String, value:Long)=>println("["+key+"]="+value)
			case _=>println()
		}
	}

	println(rs)
	//rs.foreach( rows => println(rows) )

	st.close
	conn.close

println("Hello")
