package com.board.test;

import com.board.dao.BoardDAO;
import com.board.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file:web/WEB-INF/applicationContext.xml"})
public class BoardDAOTest {
    @Inject
    private BoardDAO dao;


    public void testCreate() throws Exception {
        BoardVO vo = new BoardVO();
        vo.setTitle("테스트 제목");
        vo.setContent("테스트 내용");
        vo.setWriter("테스트");
        dao.create(vo);
    }

    @Test
    public void testRead() throws Exception {
        System.out.println(dao.read(2).toString());
    }

    public void testUpdate() throws Exception {
        BoardVO vo =  new BoardVO();
        vo.setBno(1L);
        vo.setTitle("수정제목");
        vo.setContent("수정내용");
        dao.update(vo);

    }

    public void testDelete() throws Exception {
        BoardVO vo = new BoardVO();
        dao.delete(1);
    }

}
