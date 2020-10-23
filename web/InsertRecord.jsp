<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>

<%
                String name=request.getParameter("nm");
                    String contact=request.getParameter("contact");
                    String fadd=request.getParameter("frmaddress");
                    String fcit=request.getParameter("frmcity");
                    String toadd=request.getParameter("toaddress");
                    String tocit=request.getParameter("tocity");
                    String transport=request.getParameter("trans");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            PreparedStatement st=con.prepareStatement("insert into  trans14 values(?,?,?,?,?,?,?)");
            st.setString(1,name);
            st.setString(2,contact);
            st.setString(3,fadd);
            st.setString(4,fcit);
            st.setString(5,toadd);
            st.setString(6,tocit);
            st.setString(7,transport);
            st.executeUpdate();
            response.sendRedirect("HomePage.html");
%>