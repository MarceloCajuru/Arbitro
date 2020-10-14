package com.soft.Arbitr.Controller;

import com.soft.Arbitr.Dao.ArbitroDAO;
import com.soft.Arbitr.Dao.BancoDAO;
import com.soft.Arbitr.Dao.EnderecoDAO;
import com.soft.Arbitr.Model.Arbitro;
import com.soft.Arbitr.Model.Banco;
import com.soft.Arbitr.Model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.Path;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class ArbitroController {


    @Autowired
    ArbitroDAO arbitroDAO;

    @Autowired
    EnderecoDAO enderecoDAO;

    @Autowired
    BancoDAO bancoDAO;


    @GetMapping("/portalDoArbitro")
    public String arbitro() {
        return "portalArbitro";
    }

    @GetMapping("/arbitroCadastro")
    public ModelAndView cadastro(Arbitro arbitro, Endereco endereco, Banco banco) {
        ModelAndView mv = new ModelAndView("arbitro_cadastro");
        mv.addObject("Arbitro", arbitro);
        mv.addObject("Endereco", endereco);
        mv.addObject("Banco", banco);


        return mv;
    }


    @PostMapping("/cadastroDados")
    public String cadastroDados(@ModelAttribute Arbitro arbitro) {
        arbitroDAO.save(arbitro);
        return "arbitro_cadastro";
    }

    @PostMapping("/cadastroEndereco")
    public String cadastroEndereco(@ModelAttribute Endereco endereco) {
        enderecoDAO.save(endereco);
        return "arbitro_cadastro";
    }

    @PostMapping("/cadastroBanco")
    public String cadastroBanco(@ModelAttribute Banco banco) {
        bancoDAO.save(banco);
        return "arbitro_cadastro";
    }

    @PostMapping("/cadastroSenha")
    public String cadastroSenha(@ModelAttribute Arbitro arbitro) {
        arbitroDAO.save(arbitro);
        return "arbitro_cadastro";
    }

    public static File convert(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }


   @PostMapping("/cadastroDocuments")
    public ModelAndView cadastroDocuments(@RequestParam("files") MultipartFile[] files) {

       Arrays.asList(files).stream().forEach(file -> {
           try {
               File arquivoUpload = convert(file);
               File diretorioDestino = new File("/documents");
               if(diretorioDestino.isDirectory()) {
                   boolean sucesso = arquivoUpload.renameTo(new File(diretorioDestino, arquivoUpload.getName()));
                   System.out.println(sucesso);
               }

           } catch (IOException e) {
               e.printStackTrace();
           }

       });
       ModelAndView mv = new ModelAndView("arbitro_cadastro");
       mv.addObject("Arbitro", new Arbitro() );
       mv.addObject("Endereco", new Endereco() );
       mv.addObject("Banco", new Banco());


       return mv;

   }


}







