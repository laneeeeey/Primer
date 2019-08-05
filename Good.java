package knowpets.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Good
 */
@WebServlet("/Good")
public class Good extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	int goodid;
	String goodname;
	byte goodprice;
	String goodphoto;
	String gooddiscription;
	
	public int getGoodId(){
		return goodid;
	}
	
	public String getGoodName(){
		return goodname;
	}
	
	public int getGoodid() {
		return goodid;
	}

	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}

	public String getGoodname() {
		return goodname;
	}

	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}

	public byte getGoodprice() {
		return goodprice;
	}

	public void setGoodprice(byte goodprice) {
		this.goodprice = goodprice;
	}

	public String getGoodphoto() {
		return goodphoto;
	}

	public void setGoodphoto(String goodphoto) {
		this.goodphoto = goodphoto;
	}

	public String getGooddiscription() {
		return gooddiscription;
	}

	public void setGooddiscription(String gooddiscription) {
		this.gooddiscription = gooddiscription;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public byte getGoodPrice(){
		return goodprice;
	}
	
	public void setgoodid(int goodid){
		this.goodid=goodid;
	}

	public void setgoodname(String goodname){
		this.goodname=goodname;
	}
	
	public void setgoodprice(byte goodprice){
		this.goodprice=goodprice;
	}
	
	public void setgooddiscription(String gooddiscription){
		this.gooddiscription=gooddiscription;
	}
}
