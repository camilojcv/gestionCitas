
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp"%>
<%@include file="components/bodyprimero.jsp"%>


<h1>Altas Odontologos</h1>

<form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="cc"
                                            placeholder="numero de cedula">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido"
                                            placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="Telefono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="Direccion">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="date" class="form-control form-control-user" id="fechanac"
                                            placeholder="Fecha Nac">
                                    </div>
                                     <!-- aca ira todo lo correspondiente a horarios y usuarios -->
                                </div>
                                   
                                
                                <a href="#" class="btn btn-primary btn-user btn-block">
                                    Registrar
                                </a>
                              
                            </form>

<%@include file="components/bodyfinal.jsp"%>