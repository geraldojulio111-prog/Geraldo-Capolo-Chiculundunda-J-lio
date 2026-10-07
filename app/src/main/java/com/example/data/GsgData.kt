package com.example.data

import com.example.model.Course
import com.example.model.Founder
import com.example.model.ServiceItem
import com.example.model.Testimonial

object GsgData {

    val founders = listOf(
        Founder(
            id = "geraldo",
            name = "Geraldo Júlio",
            role = "Cofundador & Diretor Geral",
            bio = "Especialista em Gestão Estratégica, Liderança Organizacional e Desenvolvimento de Negócios. Lidera a visão executiva e expansão da GSG Soluções & Capacitação.",
            highlights = listOf(
                "Gestão e Governança Corporativa",
                "Planeamento Estratégico",
                "Coordenação Pedagógica e Executiva"
            )
        ),
        Founder(
            id = "guardino",
            name = "Guardino António Simão",
            role = "Cofundador & Diretor de Operações e Serviços",
            bio = "Especialista em Logística Operacional, Gestão de Eventos, Protocolo Corporativo e Dinâmica de Equipas de Alto Rendimento.",
            highlights = listOf(
                "Supervisão de Protocolo e Eventos de Prestígio",
                "Relações Institucionais e Parcerias",
                "Gestão da Qualidade de Serviços"
            )
        ),
        Founder(
            id = "sebastiao",
            name = "Sebastião Manuel Mudomba",
            role = "Cofundador & Diretor de Formação e Capital Humano",
            bio = "Especialista em Legislação Laboral, Segurança no Trabalho e Desenvolvimento Comportamental de Equipas e Atendimento.",
            highlights = listOf(
                "Consultoria em SST e Legislação Laboral",
                "Metodologias Práticas de Aprendizagem",
                "Capacitação Comercial e Gestão de Pessoas"
            )
        )
    )

    val courses = listOf(
        Course(
            id = "atendimento",
            title = "Atendimento ao Público e ao Cliente",
            category = "Relações & Vendas",
            shortDesc = "Técnicas de excelência, postura profissional, comunicação assertiva e fidelização.",
            fullDesc = "Capacitação completa focada em transformar a postura de rececionistas, assistentes e atendentes. Aborda inteligência emocional, gestão de clientes difíceis, escuta ativa e padrões internacionais de excelência no acolhimento presencial e telefónico.",
            targetAudience = "Rececionistas, operadores de apoio ao cliente, secretárias, atendentes comerciais e gestores de balcão.",
            modules = listOf(
                "Fundamentos do Atendimento Humanizado e Corporativo",
                "Comunicação Verbal, Não-Verbal e Postura Ética",
                "Gestão de Reclamações, Conflitos e Clientes Difíceis",
                "Técnicas de Fidelização e Excelência Contínua"
            ),
            durationHours = "20 Horas (Teórico-Prático)",
            iconName = "support_agent"
        ),
        Course(
            id = "sst",
            title = "Segurança e Higiene no Trabalho (SST)",
            category = "Normas & Saúde Laboral",
            shortDesc = "Prevenção de acidentes, normas regulamentadoras, ergonomia e uso correto de EPIs.",
            fullDesc = "Curso fundamental para adequação legal e proteção da integridade física dos colaboradores. Enfatiza a identificação de riscos ambientais, medidas preventivas, procedimentos de evacuação e criação de uma cultura de segurança proativa.",
            targetAudience = "Operários, encarregados de obra, técnicos de segurança, fiscais e comissões internas de prevenção.",
            modules = listOf(
                "Enquadramento Legal e Responsabilidades em SST",
                "Identificação e Mapa de Riscos Ocupacionais",
                "Equipamentos de Proteção Individual e Coletiva (EPI/EPC)",
                "Ergonomia no Posto de Trabalho e Primeiros Socorros Básicos"
            ),
            durationHours = "25 Horas (Teórico-Prático com simulações)",
            iconName = "security"
        ),
        Course(
            id = "hierarquia",
            title = "Relação e Hierarquia no Local de Serviço",
            category = "Cultura Organizacional",
            shortDesc = "Dinâmica de liderança, respeito à hierarquia, disciplina, sinergia e cooperação.",
            fullDesc = "Fortalece a coesão institucional ensinando como respeitar a cadeia de comando mantendo um ambiente saudável, participativo e focado em metas produtivas conjuntas.",
            targetAudience = "Supervisores, chefes de equipa, técnicos e colaboradores em todos os níveis hierárquicos.",
            modules = listOf(
                "Organogramas, Canais Formais de Comunicação e Respeito Mútuo",
                "Liderança Situacional e Autoridade com Empatia",
                "Gestão de Diferenças Geracionais e Conflitos Internos",
                "Trabalho em Equipa e Alcance de Metas Corporativas"
            ),
            durationHours = "16 Horas",
            iconName = "account_tree"
        ),
        Course(
            id = "legislacao",
            title = "Direitos e Deveres dos Trabalhadores (Legislação Laboral)",
            category = "Direito & Recursos Humanos",
            shortDesc = "Direitos e obrigações segundo a Lei Geral do Trabalho, disciplina e contratos.",
            fullDesc = "Esclarecimento rigoroso sobre o quadro jurídico laboral vigente em Angola. Visa harmonizar a relação empregador-empregado, reduzir litígios trabalhistas e garantir clareza nas responsabilidades contratuais.",
            targetAudience = "Gestores de RH, líderes de equipa, delegados sindicais e colaboradores em geral.",
            modules = listOf(
                "Contratos de Trabalho: Tipos, Cláusulas e Obrigações",
                "Regime Disciplinar, Faltas, Férias e Licenças",
                "Salários, Subsídios e Direitos Adquiridos",
                "Cessação de Contrato e Resolução Pacífica de Litígios"
            ),
            durationHours = "20 Horas",
            iconName = "gavel"
        ),
        Course(
            id = "informatica",
            title = "Informática Prática",
            category = "Tecnologia & Produtividade",
            shortDesc = "Ambiente Windows, Microsoft Word, Excel para negócios, PowerPoint e Internet segura.",
            fullDesc = "Treinamento intensivo utilizando computadores diretamente no local de trabalho. Desenvolve habilidades práticas na redação de ofícios, folhas de cálculo para relatórios e criação de apresentações executivas.",
            targetAudience = "Assistentes administrativos, secretárias, operacionais e qualquer profissional que precise modernizar suas competências digitais.",
            modules = listOf(
                "Ambiente Operacional e Gestão Eficiente de Ficheiros",
                "Microsoft Word: Relatórios, Ofícios e Formatação Padrão",
                "Microsoft Excel: Tabelas, Fórmulas e Relatórios Comerciais",
                "Apresentações em PowerPoint e Navegação Corporativa Segura"
            ),
            durationHours = "30 Horas (100% Prático)",
            iconName = "computer"
        ),
        Course(
            id = "caixa_comercial",
            title = "Capacitação de Operador de Caixa e Gestão Comercial",
            category = "Finanças & Vendas",
            shortDesc = "Abertura e fecho de caixa, reconciliação, atendimento no ponto de venda e controlo de stock.",
            fullDesc = "Preparação técnica detalhada para o ecossistema de retalho e comércio moderno. Aborda gestão de numerário, detecção de notas falsas, operações POS, emissão de faturas e postura ética no caixa.",
            targetAudience = "Operadores de caixa, balconistas, fiscais de loja, comerciantes e assistentes financeiros.",
            modules = listOf(
                "Rotinas Operacionais de Caixa (Abertura, Movimento e Fecho)",
                "Prevenção de Quebras, Sangrias e Fraudes no PDV",
                "Sistemas de Faturação, TPA/POS e Meios de Pagamento",
                "Excelência no Ponto de Venda e Gestão de Estoque Básica"
            ),
            durationHours = "25 Horas (Prático)",
            iconName = "point_of_sale"
        ),
        Course(
            id = "outros_cursos",
            title = "Outros Cursos Profissionais Sob Medida",
            category = "Customizado In-Company",
            shortDesc = "Programas desenvolvidos sob medida para as necessidades específicas da sua empresa.",
            fullDesc = "A GSG desenvolve conteúdos programáticos customizados conforme o diagnóstico corporativo da sua organização, incluindo Gestão de Conflitos, Técnicas de Vendas, Secretariado Executivo e Liderança Motivacional.",
            targetAudience = "Empresas e instituições que buscam soluções desenhadas à medida do seu setor.",
            modules = listOf(
                "Diagnóstico Prévio das Necessidades da Equipa",
                "Construção de Módulos Específicos do Ramo de Atividade",
                "Workshops Práticos e Exercícios Situacionais",
                "Avaliação de Eficácia e Relatório Final de Desempenho"
            ),
            durationHours = "Carga horária flexível",
            iconName = "school"
        )
    )

    val services = listOf(
        ServiceItem(
            id = "casamentos_protocolo",
            title = "Casamentos e Protocolo",
            category = "Eventos Sociais & Cerimoniais",
            subtitle = "Elegância, precisão e distinção no seu grande dia",
            description = "Destaque absoluto da nossa equipa. Oferecemos assessoria cerimonial completa, organização de cortejo, receção VIP de padrinhos e convidados, coordenação de mesa de honra e condução impecável do cronograma para que cada instante seja inesquecível.",
            benefits = listOf(
                "Coordenação do Cortejo Nupcial e Alinhamento de Padrinhos",
                "Receção e Encaminhamento de Convidados VIP",
                "Cronograma Minuto a Minuto com Mestre de Cerimónias e Fornecedores",
                "Equipa de Protocolo Fardada e Altamente Treinada"
            ),
            iconName = "celebration",
            isFeatured = true
        ),
        ServiceItem(
            id = "eventos_corporativos",
            title = "Protocolo e Apoio em Eventos Corporativos",
            category = "Soluções Empresariais",
            subtitle = "Conferências, fóruns, lançamentos de produtos e galas",
            description = "Garantia de formalidade institucional para eventos empresariais de alto nível. Cuidamos do credenciamento dos participantes, assistência ao palanque/palco, gestão de autoridades e apoio contínuo aos palestrantes.",
            benefits = listOf(
                "Credenciamento Rápido e Recepção de Autoridades",
                "Gestão de Mesa de Honra e Etiqueta Corporativa",
                "Apoio a Palestrantes e Sala de Imprensa",
                "Controlo Operacional de Som, Projeção e Microfonia"
            ),
            iconName = "business_center"
        ),
        ServiceItem(
            id = "consultoria_empresarial",
            title = "Consultoria e Diagnóstico Organizacional",
            category = "Gestão Estratégica",
            subtitle = "Avaliação e otimização dos fluxos internos da sua empresa",
            description = "Análise aprofundada dos processos de trabalho, identificando gargalos na comunicação interna, atendimento e conformidade legal, com plano de ação estratégico.",
            benefits = listOf(
                "Auditoria de Postura e Atendimento ao Cliente",
                "Diagnóstico de Clima Organizacional e SST",
                "Reestruturação de Procedimentos Operacionais Padrão (POP)",
                "Acompanhamento Pós-Implementação"
            ),
            iconName = "analytics"
        ),
        ServiceItem(
            id = "gestao_terceirizada",
            title = "Apoio e Terceirização Operacional",
            category = "Prestação de Serviços",
            subtitle = "Fornecimento de equipas qualificadas para operações pontuais",
            description = "Disponibilização de profissionais capacitados para feiras, exposições, inventários de stock e receção temporária com supervisão direta dos gestores da GSG.",
            benefits = listOf(
                "Profissionais Pré-Capacitados pela GSG",
                "Supervisão Direta no Local pela Nossa Equipa",
                "Flexibilidade Contratual para Demandas Pontuais",
                "Garantia de Pontualidade e Postura Corporativa"
            ),
            iconName = "groups"
        )
    )

    val testimonials = listOf(
        Testimonial(
            author = "Eng. Carlos Mendes",
            company = "Grupo Industrial Atlântico",
            text = "A GSG realizou a formação de SST e Atendimento diretamente nas nossas instalações. A metodologia prática com projetor e manuais facilitou a adesão total dos nossos colaboradores. Recomendo com toda a confiança!"
        ),
        Testimonial(
            author = "Dra. Maria Eunice",
            company = "Cerimonial & Noiva Satisfeita",
            text = "A equipa de protocolo da GSG transformou o nosso casamento! Cuidaram de cada detalhe do cortejo e receção com uma elegância e discrição que encantou todos os convidados."
        ),
        Testimonial(
            author = "Dr. Francisco Tavares",
            company = "Comercial & Retalho Horizonte",
            text = "A capacitação de Operadores de Caixa e Legislação Laboral ministrada pelos fundadores trouxe rigor imediato ao nosso balcão e reduziu as falhas operacionais a zero."
        )
    )

    val contacts = ContactInfo(
        phone1 = "942 063 073",
        phone1Formatted = "+244942063073",
        phone2 = "924 416 829",
        phone2Formatted = "+244924416829",
        email = "gsgsoluções&capacitação@gmail.com",
        location = "Luanda, Angola",
        workHours = "Segunda a Sábado: 08h00 às 18h00",
        serviceScope = "Atendimento e formações in-company em toda a província de Luanda e demais províncias sob consulta."
    )
}

data class ContactInfo(
    val phone1: String,
    val phone1Formatted: String,
    val phone2: String,
    val phone2Formatted: String,
    val email: String,
    val location: String,
    val workHours: String,
    val serviceScope: String
)
