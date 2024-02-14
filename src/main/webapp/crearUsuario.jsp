<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimero.jsp"%>


<h1>Crear Usuario</h1>

                                <form class="user"action="SvUsuarios"method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreusu"name="nombreusu"
                                            placeholder="Nombre usuario">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia"name="contrasenia"
                                            placeholder="Contraseña">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol"name="rol"
                                            placeholder="Rol">
                                    </div>
                                <button  class="btn btn-primary btn-user btn-block"type="sumbit">
                                    Crear
                                </button>
                              
                            </form>

<%@include file="components/bodyfinal.jsp"%>