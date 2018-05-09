package br.com.projformulario.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.projformulario.Formulario;
import br.com.projformulario.ServFormulario;
import br.com.projformulario.util.Conexao;

public class FormularioDB {

	private Connection connection;
	private PreparedStatement ps;
	private ResultSet rs;

	public FormularioDB() {
		connection = Conexao.getConnection();
	}

	public boolean inserir(Formulario formulario) throws SQLException {

		try {

			PreparedStatement stmt = this.connection
					.prepareStatement("INSERT INTO FORMULARIO (tipoPessoa, cnpjCpf, nome, dataNasc,end, comp, cidade, estado, cep,email, confEmail, senha) values (?, ?, ?,?,?,?,?,?,?,?,?,?)");

			stmt.setInt(1, formulario.getTipoPessoa());
			stmt.setString(2, formulario.getCnpjCpf());
			stmt.setString(3, formulario.getNome());
			stmt.setString(4, formulario.getDataNasc());
			stmt.setString(5, formulario.getEnd());
			stmt.setString(6, formulario.getComp());
			stmt.setString(7, formulario.getCidade());
			stmt.setInt(8, formulario.getEstado().getId());
			stmt.setString(2, formulario.getEmail());
			stmt.setString(2, formulario.getConfEmail());
			stmt.setString(2, formulario.getSenha());

			stmt.execute();
			return true;

		} catch (SQLException e) {
			System.err.println(e.toString());
		} finally {

			connection.close();

		}
		return false;
	}

	public List<Formulario> getAll() {

		List<Formulario> lstFormulario = new ArrayList<>();
		try {
			ps = this.connection.prepareStatement("SELECT codigo, nome, telefone FROM AGENDA");
			rs = ps.executeQuery();

			while (rs.next()) {
				lstFormulario.add(new Formulario(rs.getInt("codigo"), rs.getString("nome"), rs.getString("telefone")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lstFormulario;
	}
}
