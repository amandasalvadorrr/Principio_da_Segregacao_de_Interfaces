## Princípio da Segregação de Interfaces (ISP)

Esta atividade tem como objetivo identificar e corrigir uma violação do Princípio da Segregação de Interfaces (ISP). No cenário apresentado, a interface criada pela TechStore é “obesa” e reúne operações de cadastro, comunicação e fidelidade em um único contrato. Isso obriga classes a implementar métodos que não utilizam, resultando em código inconsistente e violações de design.

A tarefa consiste em:
- Analisar por que a interface atual quebra o ISP, mostrando que clientes estão sendo forçados a depender de métodos irrelevantes.
- Segregar a interface em versões menores e coesas, cada uma voltada a uma responsabilidade específica.
- Refatorar as classes de serviço para que implementem apenas as interfaces realmente necessárias ao seu comportamento.
- Demonstrar, por meio de uma classe de execução, que o código cliente passa a interagir apenas com aquilo que é pertinente ao seu uso, eliminando métodos inúteis e fortalecendo a coesão do sistema.
