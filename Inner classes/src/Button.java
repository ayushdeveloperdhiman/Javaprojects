public class Button {
    private String tittle;
    private OnClickListener onClickListener;
    public Button(String tittle){
        this.tittle=tittle;
    }
    public String getTittle(){
        return tittle;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    public void onClick(){
        this.onClickListener.onClick(this.tittle);
    }
    public interface OnClickListener{
        public void onClick(String tittle);
    }

}
