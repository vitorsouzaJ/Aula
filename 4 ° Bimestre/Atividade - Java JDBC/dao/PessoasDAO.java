package dao;

import java.util.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Pessoas;


	public class PessoasDAO extends BaseDAO {	
	
	
// -----------------INSERIR---------------------------------------------------------------------------------------

		public void insert(Pessoas pessoas) {
		
	
			String sql = " insert into Pessoas"
					   + "(PessoaNome"
					   + ",PessoaNascimento"
					   + ",PessoaBairro"
					   + ",PessoaCidade"
					   + ",PessoaSexo"
					   + ",PessoaCPF) "
					   + " values( ?, ?, ?, ?, ?, ? ) ";
			// try-with-resources
			try(PreparedStatement prepared = getConnection().prepareStatement(sql);){	
				
				prepared.setString(1, pessoas.getPessoaNome());
				prepared.setString(2, pessoas.getPessoaNascimento());
				prepared.setString(3, pessoas.getPessoaBairro());
				prepared.setString(4, pessoas.getPessoaCidade());
				prepared.setString(5, pessoas.getPessoaSexo());
				prepared.setInt(6, pessoas.getPessoaCPF());
			
				
				prepared.execute();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}	
		
// ---------UPATADE------------------------------------------------------------------------------------------------

				
				public void updateById(Pessoas pessoas) {
					String sql = " update Pessoas"
							   + " set PessoaNome = ? "
							   + ",PessoaNascimento = ?"
							   + ",PessoaBairro = ?"
							   + ",PessoaCidade = ?"
							   + ",PessoaSexo = ?"
							   + " where PessoaCPF = ? ";
					// try-with-resources
					try(PreparedStatement prepared = getConnection().prepareStatement(sql);){
						
						prepared.setString(1, pessoas.getPessoaNome());
						prepared.setString(2, pessoas.getPessoaNascimento());
						prepared.setString(3, pessoas.getPessoaBairro());
						prepared.setString(4, pessoas.getPessoaCidade());
						prepared.setString(5, pessoas.getPessoaSexo());
						prepared.setInt(6, pessoas.getPessoaCPF());
						
						prepared.execute();
						
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
// -----------DELETAR---------------------------------------------------------------------------------------------


	public void deleteById(Pessoas pessoas) {
		String sql = " delete from Pessoas"
							   + " where PessoaCPF = ? ";

		try(PreparedStatement prepared = getConnection().prepareStatement(sql);){
						
			prepared.setInt(1, pessoas.getPessoaCPF());
						
			prepared.execute();
						
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
			
// --------------------------------------------------------------------------------------------------------
	
	public Pessoas getById(int PessoaCPF) {
		
		Pessoas pessoas = null;
		
		String sql = " select PessoaCPF,PessoaNome,PessoaNascimento ,PessoaBairro, PessoaCidade, PessoaSexo "
				+ "from Pessoas"
				+ " where PessoaCPF = ? ";
		
		// 
		try(PreparedStatement prepared = getConnection().prepareStatement(sql);){
			
			prepared.setInt(1, PessoaCPF);
			
			ResultSet result = prepared.executeQuery();
			
			if(result.next()) {
				
				pessoas = new Pessoas();
				
				pessoas.setPessoaCPF(PessoaCPF);

				pessoas.setPessoaNome(result.getString(2));
				pessoas.setPessoaNascimento(result.getString(3));
				pessoas.setPessoaBairro(result.getString(4));
				pessoas.setPessoaCidade(result.getString(5));
				pessoas.setPessoaSexo(result.getString(6));
		
			
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return pessoas;}
		
}

				
				
			
		
			
				

		
