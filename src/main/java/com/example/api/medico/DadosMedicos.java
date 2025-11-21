package com.example.api.medico;

import com.example.api.Endereco.DadosEndereco;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosMedicos (
        @NotBlank
        String nome,

        @NotBlank @Email
        String email,

        @NotBlank @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        String telefone,

        @NotNull
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco
        ) {}
