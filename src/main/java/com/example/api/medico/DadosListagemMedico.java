package com.example.api.medico;


public record DadosListagemMedico(

        String nome,

        String email,

        String crm,

        Especialidade especialidade
        ) {
        public DadosListagemMedico(Medico medico){
            this(medico.getNome(), medico.getEmail(), medico.getEmail(), medico.getEspecialidade());
        }

}
