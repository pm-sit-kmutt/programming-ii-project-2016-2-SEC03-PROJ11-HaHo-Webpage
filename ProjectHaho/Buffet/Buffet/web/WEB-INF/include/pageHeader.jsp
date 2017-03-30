<%@page import="Model.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!------nav head2------>

 <nav class="navbar navbar-default2">   
        <div class="navbar-header" id="nav02">
            <ul>
                <div class="hover" style="display:block; width:120px;"></div>
                <li class="dropdown">
                    <a href="http://localhost:8080/Buffet/index.jsp" class="dropdown-toggle"
                       data-toggle="dropdown" role="button" aria-expanded="false">H O M E </span></a> </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu2</a>
                    <ul class="dropdown-menu" role="menu">
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                        <a href="#">sub-Menu2</a>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu3</a></li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu4</a>   </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Menu5 </a></li>


                <%User u = null;
                        if (request.getSession().getAttribute("user") != null) {
                            u = (User) request.getSession().getAttribute("user");
                        }%>
                <%if (u == null) {%>

                <li class="login">
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                </li>
                <li class="login">
                    &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
                </li>
                <li class="login"><a href="http://localhost:8080/Buffet/Login.jsp" class="login" 
                                     data-toggle="modal" data-target="#basicModal" >Log in</a>
                </li>


                <%} else {%>

                <%if (u.getIsAdmin().equalsIgnoreCase("y")) {%>
                <li class="addthread"><a class="addthread" href = "#">AddThread</a></li>
                <li class="edit"><a class="edit" href="http://localhost:8080/Buffet/editProfile.jsp" >${user.getUserId()}</a></li>
                <li class="logout"><a class="logout" href="logout" >Log out</a></li>

                <%} else {%>
                <li class="addthread">  &ensp;&ensp;&ensp;&ensp;&ensp; &ensp; &ensp; &ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</li>
                <li class="edit"><a class="edit" href="http://localhost:8080/Buffet/editProfile.jsp" >[ ${user.getUserId()} ]</a></li>
                <li class="logout"><a class="logout" href="logout" >Log out</a></li>
                    <%}%>
                    <%}%>


            </ul>




        </div>
    </nav><!---nav bar--->	
