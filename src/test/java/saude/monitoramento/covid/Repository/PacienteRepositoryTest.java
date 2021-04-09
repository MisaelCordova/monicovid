package saude.monitoramento.covid.Repository;

import static org.assertj.core.api.Assertions.assertThat;


import java.sql.Date;


import org.junit.jupiter.api.Test;


import saude.monitoramento.covid.model.Paciente;


public class PacienteRepositoryTest {
	Date nasc = new Date(27-06-2000);

	@Test
	public void SaveTest() {
		
		Paciente paciente = new Paciente(true, 704608755985930L, nasc, "Misael Fernandes Córdova", "Jardim das Avenidas", 48998145731L, true, 11331358973L, "Elenice Fernandes Córdova", 'M', null, null, null, null);
		assertThat(paciente.getNome()).isEqualTo("Misael Fernandes Córdova");
	}
	 	
	
}
