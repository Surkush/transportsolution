<html>
<style>
    .imageandtexttheme
    {
        width:100%;
        height:200px;
        background: url('flash.jpg');
        background-repeat: no-repeat;
        padding-bottom: 120px;
     }
    .headtheme
    {
        font-size:40px;
        color:orange;
        
        text-align: left;
     }
    .style1 {color: #993366
	}
</style>
    <body>
        
        <%
            Cookie ck[]=request.getCookies();
            String cookieKaJunoon="";
            
            for(int i=0;i<ck.length;i++)
            {
                if(ck[i].getName().equals("KUCHBHI"))
                    cookieKaJunoon=ck[i].getValue();
            }
        %>
        <form action="LogiNCode.jsp"  method="post">
        <table width="100%">
            <tr  bgcolor="black">
                <td><font color="white">Id</font></td>
                
                <td><input type="text" name="uId"  value="<%=cookieKaJunoon%>"></td>
                
                <td><font color="white">Password</font></td>
                <td><input type="password" name="pwd"></td>
                <td><input type="submit" value="Login"></td>
            </tr>
    </form>
        </table>
        
        
        
        <div  class="imageandtexttheme">
            <br><br><br>
<h1  class="headtheme">PACKERS &nbsp;&&nbsp; MOVERS</h1>
        </div>
        
        <table WIDTH="100%"> 
            <tr ALIGN="CENTER" bgcolor="#F0E68C">
                <td><a href="HomePage.html">HOME</a></td>
                <td><a href="HomePage.html">SERVICES</a></td>
                <td><a href="HomePage.html">CITY</a></td>
                <td><a href="HomePage.html">CUSTOMER CARE</a> </td>
                <td><a href="HomePage.html">REVIEWS</a></td>
            </tr>
        </table>
        

<table width="429" height="449" border="2"  align="center"   style="border-color:red">         
    <tr>
        <td>

                <form  action="InsertRecord.jsp"   method="post">
                <table  cellspacing="20" align="center"  border="0">
            <tr align="center" bgcolor="red">
                <td colspan="2"><font color="white">SUBMIT QUOTATION</font></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="nm" ></td>
            </tr>
            <tr>
                <td>Contact No</td>
                <td><input type="text" name="contact"></td>
            </tr>
            
            <tr>
                <td>
                    From :Address
                </td>
                <td><textarea name="frmaddress"></textarea></td>
            </tr>
            <tr>
                <td>Select City</td>
                <td><select  name="frmcity">
                        <option>select</option>
                        <option>indore</option>
                        <option>pune</option>
                        <option>bhopal</option>
                        <option>bombay</option>
                        </select></td>
            </tr>
            
            
            <tr>
                <td>
            To:Address
                </td>
                <td><textarea name="toaddress"></textarea></td>
            </tr>
            <tr>
                <td>Select City</td>
                <td><select  name="tocity">
                        <option>select</option>
                        <option>indore</option>
                        <option>pune</option>
                        <option>bhopal</option>
                        <option>bombay</option>
                        </select></td>
            </tr>
            <tr>
                <td>
            Transport way
                </td>
                <td><select  name="trans">
                        <option>select</option>
                        <option>Railway</option>
                        <option>Airline</option>
                        <option>Roadway</option>
                        <option>Cargo</option>
                        </select></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="SUBMIT">
                    <input type="reset" value="Clear">
                </td>
            </tr>
        </table>
                </form>
    </td>
    </tr>
    </table>
    <p>&nbsp;</p>
    <p><span class="style1">asdfafasgd hgsajhggsa hfsadf asdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasd</span>fafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadf</p>
    asdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadfasdfafasgd hgsajhggsa hfsadf
    </body>
    </html>