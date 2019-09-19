import cn.edu.nchu.gf.common.utils.EmailUtill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.internet.MimeMessage;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Email_Test {
    @Autowired
    JavaMailSenderImpl emailSender;
    @Autowired
    EmailUtill emailUtill;
    @Value("${email.username}")
    private String username;

    // 简单邮件
    @Test
    public void SimpleMailMessage() throws Exception {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(username);//        发送人
        mailMessage.setTo("1290111906@qq.com");//          收件人
        mailMessage.setSubject("隐世集团");//               标题
        mailMessage.setText("隐无为-祝福你");            //            内容
        emailSender.send(mailMessage);
    }

    //  html 文件
    @Test
    public void htmlMailMessage() {
        MimeMessage mimeMsg = emailSender.createMimeMessage();
        try {
            String html = "<h1>隐世集团祝福你</h1>";
            MimeMessageHelper helper = new MimeMessageHelper(mimeMsg, true);
            helper.setFrom(username);
            helper.setTo("1290111906@qq.com");
            helper.setSubject("隐世集团");
            helper.setText(html, true);
            emailSender.send(mimeMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
