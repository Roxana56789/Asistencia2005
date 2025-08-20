package esfe.com.Asistencia.Servicios.Interfaces;


import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import esfe.com.Asistencia.Modelos.DocenteGrupo;


import esfe.com.Asistencia.Modelos.Docente;

public interface IDocenteGrupoService {

    List<Docente> obtenerTodos();

    Page<DocenteGrupo> buscarTodosPaginados(Pageable pageable);

    Docente buscarPorId(Integer id);

    DocenteGrupo crearOEditar(DocenteGrupo docenteGrupo);

    void eliminarPorId(Integer id);
}