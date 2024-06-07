import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DirectoriosPorFecha {
    public static void main(String[] args) {
        String rutaBase = "/ruta/al/servidor";
        String archivoMover = "/ruta/al/servidor/mi_archivo.xls";

        moverArchivoSegunFecha(archivoMover, rutaBase);
    }

    public static void moverArchivoSegunFecha(String archivoPath, String basePath){
        File archivo = new File(archivoPath);       //Pillo el archivo de su ruta
        if(!archivo.exists()){
            System.err.println("El archivo no existe");
            return;
        }

        //Obtener la fecha de creación del archivo
        long fechaCreacionArchivo = archivo.lastModified();     //Pillo la ulima fecha de modificacion del archivo
        Calendar calendar = Calendar.getInstance();     //Pillara el calendario local de donde se use el programa    
        calendar.setTimeInMillis(fechaCreacionArchivo);     //Doy formato a la fecha de creacion del archivo

        //Crear la estructura de los nombres de los directorios
        SimpleDateFormat formatoAnio = new SimpleDateFormat("yyyy");    //Formato del año
        String directorioAnio = formatoAnio.format(calendar.getTime());     //Nombre del directorio del año
        String directorioMes = new SimpleDateFormat("MMMM").format(calendar.getTime());     //Doy formato al mes y nombro el directorio con el mes
        String directorioSemana = "Semana " + calendar.get(calendar.WEEK_OF_MONTH);     //Pillo el numero de semana del mes en el que se situa la fecha del calendario
        
        //Crear los directorios si no existen
        File directorioAnioFile = new File(basePath, directorioAnio);
        File directorioMesFile = new File(directorioAnioFile, directorioMes);
        File directorioSemanaFile = new File(directorioMesFile, directorioSemana);

        directorioSemanaFile.mkdirs();      //Creo el arbol de directorios desde el final

        //mover el archivo al directorio correspondiente
        Path nuevoArchivoPath = directorioSemanaFile.toPath().resolve(archivo.getName());
        try {
            Files.move(archivo.toPath(), nuevoArchivoPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("El nuevo archivo se movió a: " + nuevoArchivoPath);
        } catch (Exception e) {
            System.out.println("Error al mover el archivo: " + e.getMessage());
        }

        public static void recogeArchivos {
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        
        }

    }

    /*La idea es sacar las hojas de excel y crear archivos mas pequeños de las mismas, despues, 
    hacer un thread que recorra estos directorios y que cuando vea que hay uno nuevo, añadir
    el nuevo archivo excel a su directorio correspondiente, de este modo tenemos todas
    las hojas fuera del documento gigante, liberando mucha carga del archivo y dejando que 
    powerApps pueda trabajar mejor con ello...*/ 
    
}
