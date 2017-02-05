
package libretadecontactossedeguanacaste.Conexion;


public class TablasDeLaBaseDeDatos {
    
    
    public String TablaInstancias()
    {
return "CREATE  table Instancias(\n" +
"IdInstancia INT not null primary key  GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),\n" +
" Instancia varchar(100) not null\n" +")";


    }
    
    public String TablaDepartamento()
    {
        return "CREATE  table Departamentos( IdDepartamento INT not null primary key GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),\n" +
" Departamento varchar(100),IdInstancia INT not null,CONSTRAINT RelacionDepartamentosInstancias Foreign Key (IdInstancia) REFERENCES Instancias (IdInstancia)\n" +
")";
    }
    
    public String TablaCoordinacion()
    {
    return "CREATE  table Coordinaciones( IdCoordinacion INT not null primary key GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),\n" +
   " Coordinacion varchar(50)\n" +")";
    }
    
       public String TablaCarreras()
       {
          return "CREATE  table Carreras( IdCarrera INT not null primary key GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),\n" +
" Carrera varchar(100),IdCoordinacion INT not null,CONSTRAINT RelacionCarreraCoordinacion Foreign Key (IdCoordinacion) REFERENCES Coordinaciones (IdCoordinacion)\n" +
")"; 
       }
       public String TablaContactos()
       {
          return "CREATE  table Contactos (IdContacto INT not null primary key GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"+
 "Contacto varchar(100),IdCarrera INT,IdDepartamento INT,EsDelSistema INT not null,"+
"CONSTRAINT RelacionContactosDepartamentos Foreign Key (IdDepartamento) REFERENCES Departamentos (IdDepartamento),"+
"CONSTRAINT RelacionContactosCarreras Foreign Key (IdCarrera) REFERENCES Carreras (IdCarrera))"; 
       }
         public String TablaTelefonos()
         {
             return "CREATE  table Telefonos( IdTelefono INT not null primary key  GENERATED ALWAYS AS IDENTITY\n" +
"        (START WITH 1, INCREMENT BY 1), Telefono varchar(100),IdContacto INT not null,\n" +
"CONSTRAINT RelacionTelefonosContactos Foreign Key (IdContacto) REFERENCES Contactos (IdContacto)\n" +
")";
         }
         
            public String TablaCorreos()
            {
               return "CREATE  table Correos( IdCorreo INT not null primary key  GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),\n" +
" Correo varchar(100),IdContacto INT not null,CONSTRAINT RelacionCorreosContactos Foreign Key (IdContacto) REFERENCES Contactos (IdContacto))"; 
            }
    
}
