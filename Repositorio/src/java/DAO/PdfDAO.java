package DAO;

import Conexion.Conectar;
import VO.PdfVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PdfDAO {

    /*Metodo listar*/
    public ArrayList<PdfVO> Listar_PdfVO() {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT cod_lib, nom_lib, autor_lib, materia_lib, fecha_pub, pdf_lib FROM libro";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setAutor(rs.getString(3));
                vo.setMateria(rs.getString(4));
                vo.setFecha(rs.getDate(5));
                vo.setArchivopdf2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
    public ArrayList<PdfVO> Listarb_PdfVO(String nom) {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM libro where materia_lib like ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1,"%"+  nom +"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setAutor(rs.getString(3));
                vo.setMateria(rs.getString(4));
                vo.setFecha(rs.getDate(5));
                vo.setArchivopdf2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
    public ArrayList<PdfVO> Listarc_PdfVO(String nom) {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM libro where autor_lib like ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1,"%"+  nom +"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setAutor(rs.getString(3));
                vo.setMateria(rs.getString(4));
                vo.setFecha(rs.getDate(5));
                vo.setArchivopdf2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
    public ArrayList<PdfVO> Listard_PdfVO(String nom) {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM libro where nom_lib like ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1,"%"+  nom +"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setAutor(rs.getString(3));
                vo.setMateria(rs.getString(4));
                vo.setFecha(rs.getDate(5));
                vo.setArchivopdf2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
    public ArrayList<PdfVO> Listare_PdfVO(String nom) {
        ArrayList<PdfVO> list = new ArrayList<PdfVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM libro where fecha_pub like ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1,"%"+  nom +"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                PdfVO vo = new PdfVO();
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setAutor(rs.getString(3));
                vo.setMateria(rs.getString(4));
                vo.setFecha(rs.getDate(5));
                vo.setArchivopdf2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }

    /*Metodo agregar*/
    public void Agregar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "INSERT INTO tema (cod_tema, nom_tema, libro) VALUES(?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigopdf());
            ps.setString(2, vo.getNombrepdf());
            ps.setBlob(3, vo.getArchivopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Modificar*/
    public void Modificar_PdfVO(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tema SET nom_tema = ?, libro = ? WHERE cod_tema = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setBlob(2, vo.getArchivopdf());
            ps.setInt(3, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Modificar*/
    public void Modificar_PdfVO2(PdfVO vo) {
        Conectar conec = new Conectar();
        String sql = "UPDATE tema SET nom_tema = ? WHERE cod_tema = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getNombrepdf());
            ps.setInt(2, vo.getCodigopdf());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_PdfVO(int id) {
        Conectar conec = new Conectar();
        String sql = "DELETE FROM tema WHERE cod_tema = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Consulta id*/
    public PdfVO getPdfVOById(int studentId) {
        PdfVO vo = new PdfVO();
        Conectar db = new Conectar();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM tema WHERE cod_tema = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setArchivopdf2(rs.getBytes(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                db.desconectar();
            } catch (Exception ex) {
            }
        }
        return vo;
    }
    
    public PdfVO getPdfVOByAut(int studentId) {
        PdfVO vo = new PdfVO();
        Conectar db = new Conectar();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM tema WHERE nom_tema = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigopdf(rs.getInt(1));
                vo.setNombrepdf(rs.getString(2));
                vo.setArchivopdf2(rs.getBytes(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                db.desconectar();
            } catch (Exception ex) {
            }
        }
        return vo;
    }

}
