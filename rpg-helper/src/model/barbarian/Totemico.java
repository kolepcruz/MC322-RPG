public class Totemico extends Barbarian {
    public int totemEspiritual(){
        if(this.getNivel()==2){
            int dano=0;
            for(int i=0;i<4;i++){
                dano+=Random1.fazRandom(6);
            }
            this.setContFuria(this.getContFuria()-10);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }

    public int sintoniaTotemica(){
        if(this.getNivel()==3){
            int dano=0;
            for(int i=0;i<5;i++){
                dano+=Random1.fazRandom(10);
            }
            this.setContFuria(this.getContFuria()-20);
            return dano;//o aventureiro pode usar essa magia e rolará o segundo valor, multiplicará pelo primeiro e perderá o terceiro em pontos de mana.
        }else{
            return 0;//o aventureiro nao possui nivel para usar essa magia, ele deve escolher outra.
        }
    }
}
