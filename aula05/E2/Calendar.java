package aula05.E2;


import aula05.E1.DateYMD;

public class Calendar {
    private int[][] eventos; // vetor bidimensional para armazenar o número de eventos agendados para cada dia do ano
    private int ano;
    private int diaDaSemanaInicioDoAno; // 1-D, 2-S, 3-T, 4-Q, 5-Q, 6-S, 7-S
    
    public Calendar(int ano, int diaDaSemanaInicioDoAno) {
        this.ano = ano;
        this.diaDaSemanaInicioDoAno = diaDaSemanaInicioDoAno;
        this.eventos = new int[12][31];
    }
    
    public int year() {
        return ano;
    }
    
    public int firstWeekdayOfYear() {
        return diaDaSemanaInicioDoAno;
    }
    
    public int firstWeekdayOfMonth(int month) {
        
        int diasPassados = diasPassadosAteOMes(month);
        int diaDaSemana = (diasPassados + diaDaSemanaInicioDoAno - 1) % 7 + 1; 
        
        return diaDaSemana;
    }
    
    public void addEvent(DateYMD data) {
        int dia = data.getDay();
        int mes = data.getMonth() - 1; // converte para índice do vetor
        eventos[mes][dia-1]++;
    }
    
    public void removeEvent(DateYMD data) {
        int dia = data.getDay();
        int mes = data.getMonth() - 1; // converte para índice do vetor
        if (eventos[mes][dia-1] > 0) {
            eventos[mes][dia-1]--;
        }
    }
    
    public String printMonth(int month) {
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        StringBuilder sb = new StringBuilder();
        sb.append("\n          "+nomesMeses[month-1]).append("\n"); // cabeçalho
        sb.append("Dom Seg Ter Qua Qui Sex Sab\n");                 // cabeçalho
        
        int diasNoMes = diasNoMes(month);
        int primeiroDiaDaSemana = firstWeekdayOfMonth(month);
        
        // adiciona espaços em branco no início para a primeira linha
        for (int i = 1; i < primeiroDiaDaSemana; i++) {
            sb.append("    ");
        }
        
        // adiciona os dias do mês
        for (int dia = 1; dia <= diasNoMes; dia++) {
            // adiciona um * se houver 
            String diaString = eventos[month-1][dia-1] > 0 ? "*" + dia : " " + dia;
            
            sb.append(diaString);
            if (primeiroDiaDaSemana == 7) {
                sb.append("\n");            // quebra de linha no sábado
                primeiroDiaDaSemana = 1;    // recomeça a contagem no domingo
            } else {
                sb.append(" ");
                primeiroDiaDaSemana++;
            }
        }
        
        // adiciona espaços em branco para os dias da semana após o último dia do mês
        while (primeiroDiaDaSemana <= 7) {
            sb.append("   ");
            primeiroDiaDaSemana++;
        }
        
        return sb.toString();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int mes = 1; mes <= 12; mes++) {
            sb.append(printMonth(mes)).append("\n");
        }
        return sb.toString();
    }

    private int diasNoMes(int mes) {
        if (mes == 2) {
            return bissexto() ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private boolean bissexto() {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    private int diasPassadosAteOMes(int mes) {
        int diasPassados = 0;
        for (int i = 1; i < mes; i++) {
            diasPassados += diasNoMes(i);
        }
        return diasPassados;
    }
    public void registerEvent(int mes, int dia, String evento) {
        eventos[mes-1][dia-1]++;


    }

    public void printEvents(int mes, int dia) {
        System.out.println("Eventos agendados para o dia " + dia + "/" + mes + ": " + eventos[mes-1][dia-1]);

    }

    

   

}

        

