public class Televisao {
    private int canal = 1;
    private int som = 0;
    private boolean ligado = false;

    /////////////////////////////////////////////////////////////////////////////////////
    public Televisao() {
    }

    public Televisao(int canal, int som) {
        if (canal > 64) {
            this.canal = 64;
            this.som = som;
        }
        if (som > 10) {
            this.som = 10;
            this.canal = canal;
        } else {
            this.canal = canal;
            this.som = som;
        }
    }

    public Televisao(int canal, int som, boolean ligado) {
        this.ligado = ligado;
        if (canal > 64) {
            this.canal = 64;
            this.som = som;
        }
        if (som > 10) {
            this.som = 10;
            this.canal = canal;
        } else {
            this.canal = canal;
            this.som = som;
            ;
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////// CONTROLE DE
    ////////////////////////////////// SOM///////////////////////////////////
    public void aumentaSom() {
        if (this.ligado == true) {
            if (this.som < 10) {
                this.som = this.som + 1;
            } else {
                System.out.println("VOLUME ESTA NO MAXIMO!!!");
            }
        }
    }

    public void diminuiSom() {
        if (this.ligado == true) {
            if (this.som > 0) {
                this.som = this.som - 1;
            } else {
                System.out.println("VOLUME MUDO");
            }
        }
    }

    public int getSom() {
        if (this.ligado == true) {
            return som;
        } else {
            return 0;
        }
    }

    public void setSom(int som) {
        if (this.ligado == true) {
            if (som > 10) {
                this.som = 10;
            } else {
                this.som = som;
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////// CONTROLE DE
    ///////////////////////////////////// CANAL///////////////////////////////
    public void sobeCanal() {
        if (this.ligado == true) {
            if (this.canal == 64) {
                this.canal = 1;
            } else {
                this.canal = this.canal + 1;
            }
        }
    }

    public void deceCanal() {
        if (this.ligado == true) {
            if (this.canal == 1) {
                this.canal = 64;
            } else {
                this.canal = this.canal - 1;
            }
        }
    }

    public int getCanal() {
        if (this.ligado == true) {
            return canal;
        } else {
            return 0;
        }
    }

    public void setCanal(int canal) {
        if (this.ligado == true) {
            if (canal > 64) {
                this.canal = 64;
            } else {
                this.canal = canal;
            }
        }

    }
    /////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////// LIGA E
    ///////////////////////////////// DESLIGA//////////////////////////////////////
    public void onoff() {
        if (this.ligado == false) {
            this.ligado = true;
            System.out.println("ligou");
        } else if (this.ligado == true) {
            this.ligado = false;
            System.out.println("desligou");
        }

    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    /////////////////////////////////////////////////////////////////////////////////////

    public void printStatus() {
        System.out.println("canal: " + this.getCanal());
        System.out.println("som: " + this.getSom());
        System.out.println("ligado: " + this.getLigado() + "\n");
    }
}
