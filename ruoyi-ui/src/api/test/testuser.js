import request from '@/utils/request'

// 查询测试列表
export function listTestuser(query) {
  return request({
    url: '/test/testuser/list',
    method: 'get',
    params: query
  })
}

// 查询测试详细
export function getTestuser(id) {
  return request({
    url: '/test/testuser/' + id,
    method: 'get'
  })
}

// 新增测试
export function addTestuser(data) {
  return request({
    url: '/test/testuser',
    method: 'post',
    data: data
  })
}

// 修改测试
export function updateTestuser(data) {
  return request({
    url: '/test/testuser',
    method: 'put',
    data: data
  })
}

// 删除测试
export function delTestuser(id) {
  return request({
    url: '/test/testuser/' + id,
    method: 'delete'
  })
}
