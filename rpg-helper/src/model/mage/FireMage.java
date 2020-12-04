public class FireMage extends Mage {
    public int chuvaDeMeteoro(){
        if(this.getNivel()==1){
            int dano=0;
            for(int i=0;i<3;i++){
                dano+=Random1.fazRandom(6);
            }
            this.setContMana(this.getContMana()-10);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int bolaDeFogo(){
        if(this.getNivel()==2){
            int dano=0;
            for(int i=0;i<4;i++){
                dano+=Random1.fazRandom(10);
            }
            this.setContMana(this.getContMana()-15);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int raioArdente(){
        if(this.getNivel()==3){
            int dano=0;
            for(int i=0;i<5;i++){
                dano+=Random1.fazRandom(10);
            }
            this.setContMana(this.getContMana()-20);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int esferaFlamejanta(){
        if(this.getNivel()==4){
            int dano=0;
            for(int i=0;i<8;i++){
                dano+=Random1.fazRandom(6);
            }
            this.setContMana(this.getContMana()-3);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }
}
