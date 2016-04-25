
<%@page import="java.util.List"%>
<%@page import="dao.PerguntaDAO"%>
<%@page import="modelo.Jogador"%>
<%@page import="modelo.Pergunta"%>
<%@page import="modelo.Jogo"%>

<%
Jogo jogo = new Jogo();
if(request.getParameter("btnConfirmar")!=null){
    out.print("Foi o Confirmar");
}
    else{
        if(request.getParameter("btnPular")!=null){
        out.print("Foi o Pular");
        }
        else{
            if(request.getParameter("btnParar")!=null){
            out.print("Foi o Parar");
            }
            else{
                if(request.getParameter("btn")!=null){
                    out.print("Foi o Parar");
                       }
                    else{
                        Jogador jogador = (Jogador)session.getAttribute("jogador");
                        
                        PerguntaDAO perg = new PerguntaDAO();
                        List<Pergunta> lista= perg.listar();
                        jogo.setPerguntas(lista);
}
}
}
}
    Pergunta pergunta = jogo.getPerguntas().get(0);
    session.setAttribute("jogo",jogo);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <a href="index.jsp">Menu</a>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/estilo.css"/>
    </head>
    <body>
        <div class="pergunta">
            <h4 class="enunciado"><%=pergunta.getEnunciado()%></h4>
            <div class="opcoes">
                <form action="pergunta.jsp" method="post">
                    <input type="radio" value="A" name="rdoPergunta" />
                    <%=pergunta.getA()%><br/>
                    <input type="radio" value="B" name="rdoPergunta" />
                    <%=pergunta.getB()%><br/>
                    <input type="radio" value="C" name="rdoPergunta" />
                    <%=pergunta.getC()%><br/>
                    <input type="radio" value="D" name="rdoPergunta" />
                    <%=pergunta.getD()%><br/>
                    <hr/>
                    <input type="submit" value="confirmar"  name="btnConfirmar"/>
                     <input type="submit" value="pular" name="btnPular"/><%=jogo.getPulos()%>
                      <input type="submit" value="parar" name="btnParar"/>
                </form>
            </div>
        </div>
            <%=jogo.getPontuacao()%><br/>
            <%=jogo.getPontuacao()%><br/>
            <%=jogo.getPontuacao()%><br/>
        </div>
    </body>
</html>
