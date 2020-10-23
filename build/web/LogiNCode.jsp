<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection , java.sql.ResultSet" %>

<%

    String id=request.getParameter("uId");
    String pass=request.getParameter("pwd");
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement st=con.prepareStatement("select * from admintab where adminid=? and password=?");
            st.setString(1,id);
            st.setString(2,pass);
            ResultSet rs=st.executeQuery();
            
                
            Cookie ck=new Cookie("KUCHBHI",id);
                ck.setMaxAge(10000000);//seconds
                response.addCookie(ck);
                
                
            
            if(rs.next())
            {
                session.setAttribute("ANYTHING", id);//HttpSession
                response.sendRedirect("MenuPage.jsp");
            }
            else
            {
                    out.println("invalid id/password");
            }

%>
